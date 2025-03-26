package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import i3.BinderC5853b;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1413Ig extends RelativeLayout {

    /* renamed from: s, reason: collision with root package name */
    private static final float[] f15979s = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: o, reason: collision with root package name */
    private AnimationDrawable f15980o;

    public C1413Ig(Context context, BinderC1377Hg binderC1377Hg, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Z2.r.l(binderC1377Hg);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f15979s, null, null));
        shapeDrawable.getPaint().setColor(binderC1377Hg.d());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(binderC1377Hg.g())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(binderC1377Hg.g());
            textView.setTextColor(binderC1377Hg.b());
            textView.setTextSize(binderC1377Hg.u7());
            C0555y.b();
            int B7 = H2.g.B(context, 4);
            C0555y.b();
            textView.setPadding(B7, 0, H2.g.B(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List v7 = binderC1377Hg.v7();
        if (v7 != null && v7.size() > 1) {
            this.f15980o = new AnimationDrawable();
            Iterator it = v7.iterator();
            while (it.hasNext()) {
                try {
                    this.f15980o.addFrame((Drawable) BinderC5853b.J0(((BinderC1484Kg) it.next()).c()), binderC1377Hg.zzb());
                } catch (Exception e8) {
                    H2.p.e("Error while getting drawable.", e8);
                }
            }
            imageView.setBackground(this.f15980o);
        } else if (v7.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) BinderC5853b.J0(((BinderC1484Kg) v7.get(0)).c()));
            } catch (Exception e9) {
                H2.p.e("Error while getting drawable.", e9);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f15980o;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
