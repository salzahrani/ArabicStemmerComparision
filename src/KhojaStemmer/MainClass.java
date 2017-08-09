package KhojaStemmer;


public class MainClass {

	public static void main(String args[])
	{
		ArabicStemmer Stemmer=new ArabicStemmer();
		String arabic = "قتال";
		try {
			System.out.println(arabic +"...."+Stemmer.stemWord(arabic));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		arabic =  "صرح المتحدث الأمني بوزارة الداخلية أنه أثناء قيام مجموعة من منسوبي قوات الطوارىء الخاصة بمنطقة عسير بأداء صلاة الظهر جماعة في مسجد مقر القوات، حدث تفجير في جموع المصلين نتج عنه استشهاد 12 من منسوبي القوات إضافة إلى ثلاثة من العاملين في الموقع وإصابة سبعة آخرين، كما عثر في الموقع على أشلاء يعتقد أنها ناتجة عن تفجير بأحزمة ناسفة ، ولا يزال الحادث محل متابعة الجهات الأمنية المختصة ، والله الهادي إلى سواء السبيل. ;";
		System.out.println(arabic);
		arabic.replace(",|;|.|-"," ");
		arabic.replace("أ","ا");
		String[] tokens_arbic = arabic.split(" ");
		String arabic_after_stem = "";
		for(String a_part:tokens_arbic)
		{
			arabic = a_part;
			try{
			//System.out.println("Trying to stem:  "+ arabic);
			String stemmedWord = Stemmer.stemWord(arabic);
			//System.out.println(arabic +"...."+stemmedWord);
			arabic_after_stem += (stemmedWord+" ");
			//System.out.println("-------------------------------------------");
			}
		 catch (Exception e) {
		    //	System.err.println("Caught IOException: " + e.getMessage());
		    //	System.out.println("Trying to stem:  "+ arabic);
			 // System.out.println(arabic +".... cannot be stemmed but returned as as:" +arabic);

				arabic_after_stem += (arabic+" ");

			 //System.out.println("-------------------------------------------");
			}
	}
		System.out.println("After stemming");
		System.out.println(arabic_after_stem);
		System.exit(0);
	}
}
