package org.teiath.ellak.ellakandroideducation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * H ResultScreen παρουσιάζει στον χρήστη τα αποτελέσματα της εκπαίδευσης / εξέτασής του. Συγκεκριμένα παρουσιάζει: <lu>
 *     <li>Το γνωστικό αντικείμενο εξέτασης</li>
 *     <li>Τον ορισμένο χρόνο εξέτασης</li>
 *     <li>Το πλήθος των ερωτήσεων του ερωτηματολογίου</li>
 *     <li>Το πλήθος των ερωτήσεων που απαντήθηκαν</li>
 *     <li>Το πλήθος των ερωτήσεων που απαντήθηκαν σωστά</li>
 *     <li>Το πλήθος των ερωτήσεων που απαντήθηκαν λανθασμένα</li>
 *     <li>Τη βαθμολογία του χρήστη (ποσοστό σωστών απαντήσεων σε σχέση με το συνολικό αριθμό ερωτήσεων</li>
 *     <li>Αποτέλεσμα εξέτασης "Επιτυχία / Αποτυχία" (μόνο σε κατάσταση εξέτασης).</li>
 * </lu>
 * H Result Screen οδηγεί στην Option Screen.
 */



public class ResultScreen extends Activity
{

    TextView subject = (TextView) findViewById(R.id.subject);         //γνωστικό αντικείμενο
    TextView preTime = (TextView) findViewById(R.id.preTime);         //χρόνος εξέτασης
    TextView squestions = (TextView) findViewById(R.id.Squestions);   //συνολικές ερωτήσεις
    TextView aquestions = (TextView) findViewById(R.id.Aquestions);   //απαντήθηκαν
    TextView rquestions = (TextView) findViewById(R.id.Rquestions);   //σωστές απαντήσεις
    TextView fquestions = (TextView) findViewById(R.id.Fquestions);   //λανθασμένες απαντήσεις
    TextView grade = (TextView) findViewById(R.id.grade);             //βαθμός
    TextView result = (TextView) findViewById(R.id.result);           // αποτέλεσμα για το εάν πέρασε ή όχι







    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.lay_result);
        Intent myintent = getIntent();      //ετοιμαζουμε το intent και τα getextras που θα παρουμε απο τα άλλα activities
        String Subject = myintent.getStringExtra("Subject");
        String PreTime = myintent.getStringExtra("Pretime");
        String Squestions = myintent.getStringExtra("Squestions");
        String Aquestions = myintent.getStringExtra("Aquestions");
        String Rquestions = myintent.getStringExtra("Rquestions");
        String Fquestions = myintent.getStringExtra("Fquestions");











    }


}
