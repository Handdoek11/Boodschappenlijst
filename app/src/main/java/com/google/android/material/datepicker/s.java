package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
abstract class s extends LinearLayoutManager {

    class a extends androidx.recyclerview.widget.j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    s(Context context, int i8, boolean z7) {
        super(context, i8, z7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.B b8, int i8) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i8);
        N1(aVar);
    }
}
