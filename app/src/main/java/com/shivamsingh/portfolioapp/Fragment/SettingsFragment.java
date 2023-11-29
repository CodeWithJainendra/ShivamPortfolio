package com.shivamsingh.portfolioapp.Fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.shivamsingh.portfolioapp.R;
import com.shivamsingh.portfolioapp.databinding.FragmentSettingsBinding;

public class SettingsFragment extends Fragment {

    FragmentSettingsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSettingsBinding.inflate(inflater, container, false);

        binding.readMoreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopupScreen();
            }
        });

        binding.readMoreTextViewsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopupScreenSecond();
            }
        });

        binding.readMoreTextViewThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopupScreenThree();
            }
        });

        binding.readMoreTextViewFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopupScreenFour();
            }
        });

        binding.readMoreTextViewFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopupScreenFive();
            }
        });
        return binding.getRoot();
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
        achievementsTextView.setText("Schooling: Kendriya Vidyalaya IIT Kanpur ( CBSE )\n\nCompletion Year: 2016\n\nPercentage: 76%\n\nSkills: Time Management, Problem-Solving\n\nSports: Football Regionals\n            •Skating Regionals\n            •Swimming\n            •Vollyball...");

        // Show the popup
        dialog.show();
    }

    private void openPopupScreenSecond() {
        // Create a Dialog to show the achievements
        final Dialog dialog = new Dialog(requireContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.popup_layout); // Create a layout file for your popup screen

        // Customize the content of the popup
        TextView achievementsTextView = dialog.findViewById(R.id.achievementsTextView);
        // Set your achievements or information here
        achievementsTextView.setText("Schooling: Wendy High School ( ISC )\n\nCompletion Year: 2018\n\nPercentage: 54%\n\nTechnical Skills: \nHacking Basics, Java Programming Skills, Strong Knowledge in Computer Science\n\nProjects: Build Robots and Drones\n\nExtracarricular:  School House Captain(Yellow- House)\n\nSelf-Learning:----\n Mobile Firmware Installation\n•Windows/ Linux / Arm64_Android...");

        // Show the popup
        dialog.show();
    }

    private void openPopupScreenThree() {
        // Create a Dialog to show the achievements
        final Dialog dialog = new Dialog(requireContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.popup_layout); // Create a layout file for your popup screen

        // Customize the content of the popup
        TextView achievementsTextView = dialog.findViewById(R.id.achievementsTextView);
        // Set your achievements or information here
        achievementsTextView.setText("Education: University Institute of Engineering & Technology ( CSJM )\n\nCompletion Year: 2022\n\nPercentage: 68.24%\n\nCourse & Stream : B-TECH / Infromation Technology\n\nTechnical Skills: Java\n•Knowledge of Android development and firmware installation\n•Proficiency in Linux/Windows\n\nProjects: \n•Android Hacking Project: Developed tools for ethical hacking on the Android platform.\n" +
                "•RAT and Trojan Development: Created remote administration tools and trojans for educational purposes.\n" +
                "•Firmware Installation on Linux: Successfully implemented firmware installations on various Linux systems.\n\nCertifications: Ethical Hacking Using Python\n•Webinars Conducted in IT Field (CORONA Phase)\n\nAndroid Apps: Quiz App\n•Calculator App\n• Basic Splash/Inro Screen Apps.... \n\nLeadership: Plays a Vital Role in GD/ Collage IT Fest\n\n•Last Year Project: Speech Emotion Recognition");

        // Show the popup
        dialog.show();
    }

    private void openPopupScreenFour() {
        // Create a Dialog to show the achievements
        final Dialog dialog = new Dialog(requireContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.popup_layout); // Create a layout file for your popup screen

        // Customize the content of the popup
        TextView achievementsTextView = dialog.findViewById(R.id.achievementsTextView);
        // Set your achievements or information here
        achievementsTextView.setText("Education: Indian Institute of Technology Kanpur \n\nCompletion Year: 2024\n\nPercentage: Pursuing( - % )\n\nTechnical Skills: \nJava, Python, HTML\n\nThesis / Dissertation: Revolutionizing Healthcare: Blockchain and AI Integration for Medical Records and Patient Care\n\n\nSoft-Skills:  problem-solving, teamwork, communication, and adaptability. \n\n Extra: Raspberry Pi Projects ( Automated Home System, Raspi-Mining, Network Blocker, Network as Server (NAS),etc... \n•Arduino UNO\n•NODE MCU\n•Linux,Windows,Drones,Robots,etc....");

        // Show the popup
        dialog.show();
    }
    private void openPopupScreenFive() {
        // Create a Dialog to show the achievements
        final Dialog dialog = new Dialog(requireContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.popup_layout); // Create a layout file for your popup screen

        // Customize the content of the popup
        TextView achievementsTextView = dialog.findViewById(R.id.achievementsTextView);
        // Set your achievements or information here
        achievementsTextView.setText("Education: Certification of Ethical Hacking Using Python from IIT Kanpur \n\n Mode:  ONLINE");

        // Show the popup
        dialog.show();
    }
}
