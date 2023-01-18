public class Main {
    public static void main(String[] args) {
        //Ex1 Obj
          Book B1=new Book("What I know for sure",55.1,"oprah");
          Movie M1=new Movie("Top Gun",70.3,"Joseph");
        System.out.println("The Book Name Is: "+B1.getName()+" The Author:  "+B1.getAuthor()+" Price Before discount: "+B1.getPrice()+" Price after discount: "+B1.getDiscount());
        System.out.println("The Movie Name Is: "+M1.getName()+" The Director: "+M1.getDirector()+" Price Before discount: "+M1.getPrice()+" Price after discount: "+M1.getDiscount());
        //Ex2 Obj
        MovablePoint MV =new MovablePoint(10,3,5,8);
        System.out.println("Moving Up");
        MV.moveUp();
        System.out.println("Moving Down");
        MV.moveDown();
        System.out.println("Moving Right");
        MV.moveRight();
        System.out.println("Moving Left");
        MV.moveLeft();
    }
}