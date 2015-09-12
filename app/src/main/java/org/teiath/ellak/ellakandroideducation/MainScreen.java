package org.teiath.ellak.ellakandroideducation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Η MainScreen είναι η βασική activity της εφαρμογής. Παρουσιάζει τις ερωτήσεις και τις πιθανές απαντήσεις, καταγράφει
 * τις απαντήσεις του χρήστη και τις αξιολογεί, μετράει το χρόνο, κ.λ.π.
 * Τρέχει σε δύο καταστάσεις λειτουργίας: Σε κατάσταση "Εκπαίδευσης" και σε κατάσταση "Εξέτασης". Στην κατάσταση
 * εκπαίδευσης δεν μετριέται χρόνος και μετά την καταχώρηση απάντησης από τον χρήστη παρουσιάζεται η σωστή απάντηση.
 * Για την υλοποίηση της activity προτείνονται οι ακόλουθες προδιαγραφές: <ul>
 *     <li>H activity να καταλαμβάνει όλη την οθόνη και το κουμπί "back" να μην δουλεύει</li>
 *     <li>Να υπάρχει κουμπί καταχώρησης απάντησης ώστε αν ο χρήστης πατήσει λάθος απάντηση να μπορεί να
 *     διορθώσει την επιλογή του. Με το κουμπί καταχώρησης οριστικοποιείται η επιλογή.</li>
 *     <li>Να φαίνεται ο αριθμός της τρέχουσας ερώτησης και ο συνολοκός αριθμός ερωτήσεων</li>
 *     <li>Οι απαντήσεις να τοποθετηθούν σε ScrollView ώστε αν δεν χωράνε όλες στην οθόνη να σκρολάρει μόνο το τμήμα των
 *     απαντήσεων.</li>
 *     <li>Ο χρήστης να μπορεί να αφήσει μία ερώτηση για αργότερα και να προχωρήσει στην επόμενη. Μετά την τελευταία
 *     το πρόγραμμα θα γυρνά στην πρώτη που δεν έχει απαντηθεί και μετά στην επόμενη, κ.ο.κ.</li>
 *     <li>Ο χρήστης δεν θα μπορεί να γυρίσει σε προηγούμενη ερώτηση (πίσω)</li>
 *     <li>Ο υπολοιπόμενος χρόνος θα παρουσιάζεται με μορφή ProgressBar ή αντίστοιχη και όχι σε μορφή κειμένου.</li>
 * </ul>
 * Η Main Screen οδηγεί στην Results Screen
 */
public class MainScreen extends Activity implements View.OnClickListener
{

    Button BtGoToResults;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.lay_main);
        BtGoToResults = (Button) findViewById (R.id.button);
        BtGoToResults.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v == BtGoToResults)
        {
            Intent ActResult = new Intent (this, ResultScreen.class);
            Bundle bu = new Bundle ();

            bu.putString ("Mode","Εκπαίδευση");
            bu.putString ("Subject", "Μηχανή");
            bu.putString ("Pretime","60");
            bu.putString("Squestions","20");
            bu.putString("Aquestions","18");
            bu.putString("Rquestions","16");
            bu.putString("Fquestions","2");
            ActResult.putExtras(bu);
            startActivity (ActResult);
        }
    }

}
