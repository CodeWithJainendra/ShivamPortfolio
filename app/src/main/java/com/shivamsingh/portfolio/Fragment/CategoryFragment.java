package com.shivamsingh.portfolio.Fragment;


import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.nitish.typewriterview.TypeWriterView;
import com.shivamsingh.portfolio.R;
import com.shivamsingh.portfolio.databinding.FragmentCategoryBinding;

public class CategoryFragment extends Fragment {

    private TypeWriterView typeWriterView;

    Button skippede,skipped;

    FragmentCategoryBinding binding;
    private String[] quotes = {
            "an Ethical Hacker",
            "a Blogger",
            "an Android App Developer"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);

        typeWriterView = view.findViewById(R.id.typeWriterView);
        skippede = view.findViewById(R.id.skippede);
        skipped=view.findViewById(R.id.skipped);

        skipped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailSubject = "Hello,";
                String emailBody = "Feel Free To Contact ❤️";

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:shivamraaj1@protonmail.com"));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
                emailIntent.putExtra(Intent.EXTRA_TEXT, emailBody);

                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });

        skippede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = "Hoping for Your Positive Response 😇";
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Uri uri = Uri.parse("https://drive.usercontent.google.com/download?id=1lAXqfhWK8vLRSpkAme-00EjsunXYwDlZ&export=download&authuser=0&confirm=t&uuid=b8e33bbf-f66e-4264-9fc3-a2c99e6a5a8c&at=APZUnTVv6BoeojLNbeMW0aT6pMHB:1701246817296");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);

                        // Show the string text (you can customize this part based on how you want to display the text)
                        Toast.makeText(getContext(), title, Toast.LENGTH_SHORT).show();
                    }
                }, 1200); // 5000 milliseconds (5 seconds) delay, change this value as needed
            }
        });

        animateTextWithDelay(0);

        return view;

    }

    private void animateTextWithDelay(final int index) {
        if (index >= 0 && index < quotes.length && quotes[index] != null && !quotes[index].isEmpty()) {
            typeWriterView.animateText(quotes[index]);

            // Delay for the backspace effect (adjust the delay time as needed)
            new Handler().postDelayed(() -> {
                // Clear the text with a backspace effect
                typeWriterView.animateText("");

                // Recursively call for the next quote after a short delay
                new Handler().postDelayed(() -> {
                    int nextIndex = (index + 1) % quotes.length;
                    animateTextWithDelay(nextIndex);
                }, 1500); // Adjust the delay time for a smooth transition
            }, 5000); // Adjust the delay time for backspace
        } else {
            // Handle the case when the index is out of bounds or the quote is empty
            Log.e("TypeWriterView", "Invalid index or empty quote at index: " + index);
            // You might want to stop the animation or take appropriate action here
        }
    }

}
