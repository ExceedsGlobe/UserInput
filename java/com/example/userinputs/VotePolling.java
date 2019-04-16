package com.example.userinputs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class VotePolling extends Activity {
ImageView pepsiImg;
ImageView cokeImg;
TextView results;
int noOfVotesP=0;
int noOfVotesC=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_polling);
        pepsiImg=findViewById(R.id.pepsi);
        cokeImg=findViewById(R.id.coke);
        results=findViewById(R.id.resultsOfVotes);
    }


    public void checkWinner(View view) {
        String message="";

        if (noOfVotesC==noOfVotesP){
            message+="Draw!\n"+noOfVotesC+"-"+noOfVotesP;
        }
        else if (noOfVotesC>noOfVotesP){
            message+="Winner!\n"+"Coke\n"+noOfVotesC+"-"+noOfVotesP;
        }
        else{
            message+="Winner!\n"+"Pepsi\n"+noOfVotesP+"-"+noOfVotesC;
        }
        results.setText(message);
    }

    public void votePepsi(View view) {
        noOfVotesP=noOfVotesP+1;
    }

    public void voteCoke(View view) {
        noOfVotesC=noOfVotesC+1;
    }
}
