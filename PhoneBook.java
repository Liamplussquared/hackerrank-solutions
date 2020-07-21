import java.util.*;

class PhoneBook{
	public static void main(String []argh)
	{
        // create HashMap for storing names & numbers
        Map<String, Integer> phonebook = new HashMap<String, Integer>();

		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            // add key,value pair to hashmap
            phonebook.put(name, phone);
			in.nextLine();
		}

		while(in.hasNext())
		{
			String s=in.nextLine();
            // print out appropriate response to entered string
            if (phonebook.containsKey(s)) {
                System.out.println(s + "=" + phonebook.get(s));
            }
            else {
                System.out.println("Not found");
            }
		}
	}
}
