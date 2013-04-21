package beproactive.language.levantai;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnBrowseQuestions = (Button)findViewById(R.id.btnBrowseQuestions);
		Button btnStart = (Button)findViewById(R.id.btnStart);
		Button btnResults = (Button)findViewById(R.id.btnResults);
		Button btnExit = (Button)findViewById(R.id.btnExit);
		
		// xu ly su kien Click tren cac Button
		btnExit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				MainActivity.this.finish();
				
			}
		});
		
		btnStart = (Button)findViewById(R.id.btnStart);
		btnStart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startQuizs();
				
			}
		});
		
	}
	
	public void startQuizs() {
		Intent intent = new Intent(this, CreateQuizActivity.class);
		intent.putExtra("mark", false);
		startActivity(intent);
	}

}
