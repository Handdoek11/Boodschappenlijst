package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6254d {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f39621a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f39622b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f39623c;

    /* renamed from: d, reason: collision with root package name */
    public final Guideline f39624d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f39625e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f39626f;

    private C6254d(ConstraintLayout constraintLayout, ProgressBar progressBar, ImageView imageView, Guideline guideline, ConstraintLayout constraintLayout2, TextView textView) {
        this.f39621a = constraintLayout;
        this.f39622b = progressBar;
        this.f39623c = imageView;
        this.f39624d = guideline;
        this.f39625e = constraintLayout2;
        this.f39626f = textView;
    }

    public static C6254d a(View view) {
        int i8 = H2.f33487B;
        ProgressBar progressBar = (ProgressBar) AbstractC6246a.a(view, i8);
        if (progressBar != null) {
            i8 = H2.f33524N0;
            ImageView imageView = (ImageView) AbstractC6246a.a(view, i8);
            if (imageView != null) {
                i8 = H2.f33527O0;
                Guideline guideline = (Guideline) AbstractC6246a.a(view, i8);
                if (guideline != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i8 = H2.f33486A1;
                    TextView textView = (TextView) AbstractC6246a.a(view, i8);
                    if (textView != null) {
                        return new C6254d(constraintLayout, progressBar, imageView, guideline, constraintLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6254d c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6254d d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33702e, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f39621a;
    }
}
