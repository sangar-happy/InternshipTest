package com.example.internshiptest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.internshiptest.R;
import com.example.internshiptest.entity.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectHolder> {

    List<Subject> subjectList;

    public SubjectAdapter(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @NonNull
    @Override
    public SubjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.subject_layout, parent, false);
        return new SubjectHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectHolder holder, int position) {
        Subject subject = subjectList.get(position);
        holder.mSubjectName.setText(subject.getSubjectName());
    }

    @Override
    public int getItemCount() {
        return subjectList.size();
    }

    class SubjectHolder extends RecyclerView.ViewHolder {
        ImageView mSubjectPicture;
        TextView mSubjectName;
        ProgressBar mProgressBar;
        TextView mProgressPercentage;

        public SubjectHolder(@NonNull View itemView) {
            super(itemView);
            this.mSubjectPicture = itemView.findViewById(R.id.subject_picture);
            this.mSubjectName = itemView.findViewById(R.id.subject_name);
            this.mProgressBar = itemView.findViewById(R.id.progressbar);
            this.mProgressPercentage = itemView.findViewById(R.id.progress_percentage);
        }
    }
}
