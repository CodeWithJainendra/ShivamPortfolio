package com.shivamsingh.portfolioapp.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.shivamsingh.portfolioapp.R;
import com.shivamsingh.portfolioapp.SliderData.TypeWriter;
import com.shivamsingh.portfolioapp.databinding.FragmentCategoryBinding;

public class CategoryFragment extends Fragment {

    private TypeWriter typeWriterView;
    private Button skippede, skipped;


    private static final int ANIMATION_DELAY = 5000;  // Delay for showing the text
    private static final int BACKSPACE_DELAY = 1500;  // Delay before backspacing

    private String[] quotes = {
            "an Ethical Hacker",
            "a Blogger",
            "an Android App Developer"
    };
    private int currentIndex = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        typeWriterView = view.findViewById(R.id.typeWriterView);
        skippede = view.findViewById(R.id.skippede);
        skipped = view.findViewById(R.id.skipped);


        skipped.setOnClickListener(v -> {
            String emailSubject = "Hello,";
            String emailBody = "Feel Free To Contact ❤️";

            Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:shivamraaj1@protonmail.com"));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
            emailIntent.putExtra(Intent.EXTRA_TEXT, emailBody);

            startActivity(Intent.createChooser(emailIntent, "Send email"));
        });

        skippede.setOnClickListener(v -> {
            if (isAdded()) {
                String title = "Hoping for Your Positive Response 😇";
                new Handler().postDelayed(() -> {
                    Uri uri = Uri.parse("https://drive.usercontent.google.com/download?id=1lAXqfhWK8vLRSpkAme-00EjsunXYwDlZ&export=download&authuser=0&confirm=t&uuid=b8e33bbf-f66e-4264-9fc3-a2c99e6a5a8c&at=APZUnTVv6BoeojLNbeMW0aT6pMHB:1701246817296");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    if (getContext() != null) {
                        startActivity(intent);
                        Toast.makeText(getContext(), title, Toast.LENGTH_SHORT).show();
                    }
                }, ANIMATION_DELAY); // Delay for showing the text
            }
        });

        animateTextWithDelay(0);

        return view;
    }

    private void animateTextWithDelay(final int index) {
        if (currentIndex < 0 || currentIndex >= quotes.length) {
            // Handle the case when the index is out of bounds
            Log.e("TypeWriterView", "Invalid index: " + currentIndex);
            return;
        }

        String currentQuote = quotes[currentIndex];

        if (currentQuote.isEmpty()) {
            // Skip empty strings
            currentIndex = (currentIndex + 1) % quotes.length;
            animateTextWithDelay(0);
            return;
        }

        typeWriterView.animateText(currentQuote);

        // Delay for the backspace effect (adjust the delay time as needed)
        new Handler().postDelayed(() -> {
            // Clear the text with a backspace effect
            typeWriterView.animateText("");

            // Move to the next quote after a short delay
            new Handler().postDelayed(() -> {
                currentIndex = (currentIndex + 1) % quotes.length;
                animateTextWithDelay(0);
            }, BACKSPACE_DELAY); // Adjust the delay time for a smooth transition
        }, ANIMATION_DELAY); // Adjust the delay time for backspace
    }


}
