class Animal
{
	private String name;
	int age;
	Animal()
	{
		
	}
	Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void getDetails()
	{
		System.out.println("name:"+name);
        System.out.println("Age:"+age);
	}
	
}
class Lion extends Animal{
	private boolean isAlpha;
    Lion(String name,int age,boolean isAlpha)
    {
        super(String name,int age);
        this.isAlpha=isAlpha;
    }
    public void getDetails()
    {
    	System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("isAlpha:"+isAlpha);
    }
}
class Elephant extends Animal{
	private double trunkLength;
    Elephant(String name,int age,boolean isAlpha,double trunkLength)
    {
        super(String name,int age,boolean isAlpha);
        this.trunkLength=trunkLength;
    }
	public void getDetails()
	{
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("isAlpha:"+isAlpha);
		System.out.println("trunkLength:"+trunkLength);
	}
}
class zoo
{
    Animal ref;
    zoo(){}
    public void addAnimal(Animal ref)
    {
        if(this.ref==null){
            this.ref=ref;
			System.out.println("Animal added");
           }
        else
		  System.out.println("Animal already added");
    }
	public void showAnimal()
	{
       if(ref instanceof Lion)
	      System.out.println(ref.getDetails);
	   else if (ref instanceof Elephant)
          System.out.println(ref.getDetails);

	}
    public static void main(String[]args)
    {
        Animal ref = new Animal("tiger",40);
        zoo ref1 = new zoo();
		Lion ref2 = (Lion)ref;
		Elephant ref3= (Elephant)ref;
		
    }
}