/**
 * Created by zhk on 2017/3/5.
 */
public class EchoServiceImp1 implements EchoService {
    @Override
    public String echo(String ping){
        return ping!=null?ping + "---->I am ok" : "I am ok";
    }

}
