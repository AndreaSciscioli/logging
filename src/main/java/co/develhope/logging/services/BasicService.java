package co.develhope.logging.services;

import co.develhope.logging.controllers.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
;

@Service
public class BasicService {
    @Value("${customEnvs.n1}") String x;
    @Value("${customEnvs.n2}") String y;
    Logger logger = LoggerFactory.getLogger(BasicController.class);
    public double power (){
        //int answer = 1;
        //if(y == 0){return answer;} else if (y!=0) {
        //for(int i=0; i<y; i++){answer = answer*x;}}

        double power;
        logger.info("start calculation");
        power = Math.pow(Integer.valueOf(x),Integer.valueOf(y));
        logger.info("end calculation");
        return power;


    }
}
