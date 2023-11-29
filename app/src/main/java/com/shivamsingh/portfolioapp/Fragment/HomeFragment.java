package com.shivamsingh.portfolioapp.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.shivamsingh.portfolioapp.R;
import com.shivamsingh.portfolioapp.SliderData.SliderAdapter;
import com.shivamsingh.portfolioapp.SliderData.SliderData;
import com.shivamsingh.portfolioapp.databinding.FragmentHomeBinding;
import com.shivamsingh.portfolioapp.databinding.FragmentSettingsBinding;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import android.view.Window;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    FloatingActionButton floatingActionButton, socialone, socialtwo, socialthree, socialfour, socialfive;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.floationgsocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScoiaMediaLayout(v);
            }
        });

        binding.floatingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopupScreen();
            }

        });

        // Your image URLs
        String url1 = "https://jainendrasingh.netlify.app/images/logosix.png";
        String url2 = "https://jainendrasingh.netlify.app/images/loggosecong.png";
        String url3 = "https://jainendrasingh.netlify.app/images/logoothree.jpeg";
        String url4 = "https://jainendrasingh.netlify.app/images/logoofour.png";
        String url5 = "https://jainendrasingh.netlify.app/images/logofive.jpeg";
        // Convert List to ArrayList
        List<SliderData> sliderDataList = new ArrayList<>();
        sliderDataList.add(new SliderData(url1, "Find love on the go with Dating Mobi—Your Match Awaits!"));
        sliderDataList.add(new SliderData(url2, "Indulge cravings with Munchies: Bite-sized joy at your fingertips!"));
        sliderDataList.add(new SliderData(url3, "Elevating urban journeys with swift, smart, and reliable solutions."));
        sliderDataList.add(new SliderData(url4, "Sip warmth on the go: Thermos app, your beverage guardian. "));
        sliderDataList.add(new SliderData(url5, "Ignite innovation, fueling your projects with boundless possibilities"));

        // Initialize the SliderView
        SliderView sliderView = view.findViewById(R.id.slider);

        // Create and set up the adapter
        SliderAdapter adapter = new SliderAdapter(requireContext(), new ArrayList<>(sliderDataList));
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        sliderView.setSliderAdapter(adapter);
        sliderView.setScrollTimeInSec(5);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();

        return view;


    }



    private void openScoiaMediaLayout(View view) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext());
        bottomSheetDialog.setContentView(R.layout.fragment_socialmedia);

        // Initialize the views in the BottomSheetDialog
        socialone = bottomSheetDialog.findViewById(R.id.socialone);
        socialtwo = bottomSheetDialog.findViewById(R.id.socialtwo);
        socialthree = bottomSheetDialog.findViewById(R.id.socialthree);
        socialfour = bottomSheetDialog.findViewById(R.id.socialfour);
        socialfive = bottomSheetDialog.findViewById(R.id.socialfive);

        // Set OnClickListener for each button
        if (socialone != null) {
            socialone.setOnClickListener(getSocialOnClickListener("hhttps://www.facebook.com/SHIVAMisKHUSH"));
        }
        if (socialtwo != null) {
            socialtwo.setOnClickListener(getSocialOnClickListener("https://instagram.com/cyrusdemon7?igshid=MzMyNGUyNmU2YQ=="));
        }
        if (socialthree != null) {
            socialthree.setOnClickListener(getSocialOnClickListener("https://www.linkedin.com/in/codewithjainendra/"));
        }
        if (socialfour != null) {
            socialfour.setOnClickListener(getSocialOnClickListener("https://wa.me/96757879818?text=Hello,%20Shivam,%20"));
        }
        if (socialfive != null) {
            socialfive.setOnClickListener(getSocialOnClickListener("https://github.com/CodeWithJainendra"));
        }

        bottomSheetDialog.show();
    }

    private View.OnClickListener getSocialOnClickListener(final String url) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        };
    }




    private void openPopupScreen() {
        // Create a Dialog to show the achievements
        final Dialog dialog = new Dialog(requireContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.popup_layout); // Create a layout file for your popup screen

        // Customize the content of the popup
        TextView achievementsTextView = dialog.findViewById(R.id.achievementsTextView);
        // Set your achievements or information here
        achievementsTextView.setText("Hello There,\n\n\n" +
                "Thank you for visiting my portfolio website! I'm thrilled that you took the time to explore my work. If you have any questions about my projects, want to collaborate, or simply want to say hello, I'd love to hear from you. Feel free to reach out using the contact form below or connect with me through my social media links. Looking forward to connecting with you and discussing exciting opportunities together! \n\n\n \uD83D\uDE07  Name: \n Jainendra Singh \n\n\uD83C\uDFE0  Address: \n Street 62 , Type 1 IIT Kanpur Uttar-Pradesh, 208016 \n\n\uD83D\uDCE7  Email: \n  shivamraaj1@protonmail.com\n\n\n");

        // Show the popup
        dialog.show();
    }
}
