
public class Movie {
   int movid;
   String movname,producer;
   int releaseyear;
   int boxofficecollection;
   
   Movie(int movid,String movname,int releaseyear,int boxofficecollection,String producer)
   {
	   this.movid=movid;
	   this.movname=movname;
	   this.releaseyear=releaseyear;
	   this.boxofficecollection=boxofficecollection;
	   this.producer=producer;
   }
   public String toString() {
   return movid+""+movname+""+releaseyear+""+boxofficecollection+""+producer+"";
}
}