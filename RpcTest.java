import java.net.InetSocketAddress;

/**
 * Created by zhk on 2017/3/5.
 */
public class RpcTest {
    public static void main(String[] args) throws Exception{
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    RpcExporter.exporter("localhost",8088);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
        RpcImporter<EchoService> importer  = new RpcImporter<EchoService>();
        EchoService echo = importer.importer(EchoService.class,new InetSocketAddress("localhost",8088));
        System.out.println(echo.echo("Are you Ok ?"));
    }
}
