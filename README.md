# springboot-batch-example
springboot-batch-example


# batch shell 추가

## batch.sh (1분에 3번 작동)

 #!/usr/bin/vi
 
 SLEEP_SECOND=20

 function task {
     echo =================================== DEMON START ===================================
     echo ============================== $(date "+%Y-%m-%d %T") ===================================
}

for i in $(seq -s " " 1 ${SLEEP_SECOND} 60);do
    task > /Users/[경로]/batch.log
    java -jar /Users/[경로]/batch.jar?date=$(date "+%Y-%m-%d %T") > /Users/[경로]/batch.log
    sleep ${SLEEP_SECOND};
 done



## crontab에 추가
#!/bin/bash
00 3 * * * sh /Users/[경로]/batch.sh