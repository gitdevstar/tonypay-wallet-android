package com.alphawallet.app.ui;

import androidx.fragment.app.Fragment;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.alphawallet.app.R;


public class BaseFragment extends Fragment implements Toolbar.OnMenuItemClickListener {
    private Toolbar toolbar;
    private TextView toolbarTitle;

    private void initToolbar(View view) {
        toolbar = view.findViewById(R.id.toolbar);
        toolbarTitle = toolbar.findViewById(R.id.toolbar_title);
        toolbarTitle.setTextColor(Color.WHITE);
    }
    protected void toolbar(View view) {
        initToolbar(view);
    }

    protected void toolbar(View view, int title, int menuResId) {
        initToolbar(view);
        setToolbarTitle(title);
        setToolbarMenu(menuResId);
    }

    protected void toolbar(View view, int menuResId) {
        initToolbar(view);
        setToolbarMenu(menuResId);
    }

    protected void toolbar(View view, int menuResId, Toolbar.OnMenuItemClickListener listener) {
        initToolbar(view);
        setToolbarMenu(menuResId);
        setToolbarMenuItemClickListener(listener);
    }

    protected void toolbar(View view, int title, int menuResId, Toolbar.OnMenuItemClickListener listener) {
        initToolbar(view);
        setToolbarTitle(title);
        setToolbarMenu(menuResId);
        setToolbarMenuItemClickListener(listener);
    }

    protected void setToolbarTitle(String title) {
        if (toolbarTitle != null) {
            toolbarTitle.setText(title);
        }
    }

    protected void setToolbarMenuItemClickListener(Toolbar.OnMenuItemClickListener listener) {
        toolbar.setOnMenuItemClickListener(listener);
    }

    protected void setToolbarTitle(int title) {
        setToolbarTitle(getString(title));
    }

    protected void setToolbarMenu(int menuRes) {
        toolbar.inflateMenu(menuRes);
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }

    public void comeIntoFocus()
    {
        //
    }

    public void leaveFocus()
    {
        //
    }
}
