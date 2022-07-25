package string;

public class sample {

	public static void main(String[] args) {
		String name="Maharashtra";
		System.out.println(name.length());
        int lengthOfString = name.length();
        System.out.println(lengthOfString);
        System.out.println("==============");
        
        String resultup = name.toUpperCase();
        System.out.println(resultup);
        String resultlc = name.toLowerCase();
        System.out.println(resultlc);
        
        String a="Maharashtra";
		String b="Maharashtra";
		String c=new String("Maharashtra");
		String d=new String("Maharashtra");
		String e=new String("MAHARASHTRA");
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==c);
		System.out.println("==============");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(e));
		System.out.println("==============");
		System.out.println(a.equalsIgnoreCase(e));
		boolean result3 = a.equalsIgnoreCase(c);
		System.out.println(result3);
		System.out.println("==============");
		
		String name1="Welcome";
		System.out.println(name1.contains("Wel"));
		boolean containsResult = name1.contains("come");
		System.out.println(containsResult);
		System.out.println("==============");
		
		String p="Test";
	    String q=" ";
	    String r="";
		boolean Is = p.isEmpty();
		System.out.println(Is);
		System.out.println(q.isEmpty());
		System.out.println(r.isEmpty());
		System.out.println("==============");
		System.out.println(p.isBlank());
		System.out.println(q.isBlank());
		System.out.println(r.isEmpty());
		System.out.println("==============");
		
		String name2="Welcome";
		System.out.println(name2.charAt(2));
		char charatresult = name2.charAt(5);
		System.out.println(charatresult);
		System.out.println("==============");
		
		System.out.println(name2.startsWith("Wel"));
		System.out.println(name2.startsWith("el"));
		System.out.println(name2.startsWith("l", 2));
		
		System.out.println(name2.endsWith("come"));
		System.out.println("==============");
		
		String s="THIS IS MY COUNTRY";
		String q1[]=s.split(" ");
		for(int i=0;i<=q1.length-1;i++)
		{
			System.out.println(q1[i]);
		}
		
		
		
		
		
		
	}

}
