package tugas;


public class matematika{
    float pertambahan(){
        return 0;
    }
    float pengurangan(){
        return 0;
    }
    float perkalian(){
        return 0;
    }
    float pembagian(){
        return 0;
    }
}

class Matematika extends matematika{
    int a, b;
    public Matematika(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public float pertambahan(){
       return this.a + this.b ;
    }
 @Override
 public float pengurangan(){
    return this.a - this.b ;
 } 
 @Override
 public float perkalian(){
    return this.a * this.b ;
 } 
 @Override
 public float pembagian(){
    return this.a / this.b ;
 }
}

   
    // int a, b;
    
    // public matematika(int a, int b){
    //     this.a = a;
    //     this.b = b;
    
    // }
//  @Override
//  public float pertambahan extends matematika(){
//     return this.a + this.b ;
//  }
//  @Override
//  public float pengurangan(){
//     return this.a - this.b ;
//  } 
//  @Override
//  public float perkalian(){
//     return this.a * this.b ;
//  } 
//  @Override
//  public float pembagian(){
//     return this.a / this.b ;
//  }

