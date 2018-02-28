import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Random;

public class LambdaTest implements RequestHandler<PurgeRequest, WorkStatus> {

    Random random = new Random();

    public WorkStatus handleRequest(PurgeRequest input, Context context)  {


        while(context.getRemainingTimeInMillis() > 1500){
            try {
                Thread.sleep(1000);
                int i = random.nextInt(100);
                if(i == 1){
                    return WorkStatus.FAILED;
                }
                System.out.println(input + "Time left" + context.getRemainingTimeInMillis());
            }catch(InterruptedException e){

            }
        }

        return WorkStatus.SUCCESS;
    }
}

