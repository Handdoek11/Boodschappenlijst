package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import com.headcode.ourgroceries.android.view.BoundedButton;
import n1.AbstractC6246a;

/* renamed from: n5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6256f {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39632a;

    /* renamed from: b, reason: collision with root package name */
    public final BoundedButton f39633b;

    /* renamed from: c, reason: collision with root package name */
    public final BoundedButton f39634c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f39635d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f39636e;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputEditText f39637f;

    /* renamed from: g, reason: collision with root package name */
    public final BoundedButton f39638g;

    private C6256f(LinearLayout linearLayout, BoundedButton boundedButton, BoundedButton boundedButton2, TextView textView, Toolbar toolbar, TextInputEditText textInputEditText, BoundedButton boundedButton3) {
        this.f39632a = linearLayout;
        this.f39633b = boundedButton;
        this.f39634c = boundedButton2;
        this.f39635d = textView;
        this.f39636e = toolbar;
        this.f39637f = textInputEditText;
        this.f39638g = boundedButton3;
    }

    public static C6256f a(View view) {
        int i8 = H2.f33505H;
        BoundedButton boundedButton = (BoundedButton) AbstractC6246a.a(view, i8);
        if (boundedButton != null) {
            i8 = H2.f33535R;
            BoundedButton boundedButton2 = (BoundedButton) AbstractC6246a.a(view, i8);
            if (boundedButton2 != null) {
                i8 = H2.f33556Z;
                TextView textView = (TextView) AbstractC6246a.a(view, i8);
                if (textView != null) {
                    i8 = H2.f33587j1;
                    Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                    if (toolbar != null) {
                        i8 = H2.f33590k1;
                        TextInputEditText textInputEditText = (TextInputEditText) AbstractC6246a.a(view, i8);
                        if (textInputEditText != null) {
                            i8 = H2.f33602o1;
                            BoundedButton boundedButton3 = (BoundedButton) AbstractC6246a.a(view, i8);
                            if (boundedButton3 != null) {
                                return new C6256f((LinearLayout) view, boundedButton, boundedButton2, textView, toolbar, textInputEditText, boundedButton3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6256f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6256f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33718u, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39632a;
    }
}
