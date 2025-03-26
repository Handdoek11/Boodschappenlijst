package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f32143a = new a();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private static ImageView a(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i8 = 0; i8 < toolbar.getChildCount(); i8++) {
            View childAt = toolbar.getChildAt(i8);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static ImageView b(Toolbar toolbar) {
        return a(toolbar, toolbar.getLogo());
    }

    public static TextView c(Toolbar toolbar) {
        List d8 = d(toolbar, toolbar.getSubtitle());
        if (d8.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(d8, f32143a);
    }

    private static List d(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < toolbar.getChildCount(); i8++) {
            View childAt = toolbar.getChildAt(i8);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TextView e(Toolbar toolbar) {
        List d8 = d(toolbar, toolbar.getTitle());
        if (d8.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(d8, f32143a);
    }
}
