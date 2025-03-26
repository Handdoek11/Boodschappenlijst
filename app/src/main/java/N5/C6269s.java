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

/* renamed from: n5.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6269s {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39733a;

    /* renamed from: b, reason: collision with root package name */
    public final BoundedButton f39734b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f39735c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f39736d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f39737e;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputEditText f39738f;

    private C6269s(LinearLayout linearLayout, BoundedButton boundedButton, LinearLayout linearLayout2, TextView textView, Toolbar toolbar, TextInputEditText textInputEditText) {
        this.f39733a = linearLayout;
        this.f39734b = boundedButton;
        this.f39735c = linearLayout2;
        this.f39736d = textView;
        this.f39737e = toolbar;
        this.f39738f = textInputEditText;
    }

    public static C6269s a(View view) {
        int i8 = H2.f33554Y;
        BoundedButton boundedButton = (BoundedButton) AbstractC6246a.a(view, i8);
        if (boundedButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = H2.f33556Z;
            TextView textView = (TextView) AbstractC6246a.a(view, i8);
            if (textView != null) {
                i8 = H2.f33587j1;
                Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                if (toolbar != null) {
                    i8 = H2.f33590k1;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC6246a.a(view, i8);
                    if (textInputEditText != null) {
                        return new C6269s(linearLayout, boundedButton, linearLayout, textView, toolbar, textInputEditText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6269s c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6269s d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33692V, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39733a;
    }
}
