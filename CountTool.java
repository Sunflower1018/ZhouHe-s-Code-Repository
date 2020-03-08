public class CountTool 
{
    //-----------ADD-----------
    public static double add(double d1, double d2, int scale)
    {
        //用d1 = 1, d2 = 0.1235 , scale = 3举例
        int flag = scale; //记录小数位数为while循环退出的条件
        int ten = 1;      //ten的作用：1.1235 --> 11235
        while (flag >= 0)
        { ten *= 10; flag--;}//ten = 10000

        double dcl = (int)((d1 + d2) * ten);//  dcl:11235    dcl:decimal用于后续获取小数
        double itr = (int)dcl / ten;// itr:1     itr：integer用于获得整数部分
        dcl %= ten;  //dcl：1235
        dcl =  ((dcl%10 >= 5) ?  (int)(dcl/10) + 1 : (int)(dcl / 10));//dcl:1235 --> 124
        dcl /= ( ten/10 );//dcl：124 --> 0.124

        return (dcl+itr);//return(1+0.124);
    }
}