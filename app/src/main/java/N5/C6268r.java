package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import com.headcode.ourgroceries.android.view.BoundedButton;
import n1.AbstractC6246a;

/* renamed from: n5.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6268r {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39725a;

    /* renamed from: b, reason: collision with root package name */
    public final BoundedButton f39726b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f39727c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f39728d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f39729e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f39730f;

    /* renamed from: g, reason: collision with root package name */
    public final TextInputEditText f39731g;

    /* renamed from: h, reason: collision with root package name */
    public final BoundedButton f39732h;

    private C6268r(LinearLayout linearLayout, BoundedButton boundedButton, Button button, LinearLayout linearLayout2, TextView textView, Toolbar toolbar, TextInputEditText textInputEditText, BoundedButton boundedButton2) {
        this.f39725a = linearLayout;
        this.f39726b = boundedButton;
        this.f39727c = button;
        this.f39728d = linearLayout2;
        this.f39729e = textView;
        this.f39730f = toolbar;
        this.f39731g = textInputEditText;
        this.f39732h = boundedButton2;
    }

    public static C6268r a(View view) {
        int i8 = H2.f33633z;
        BoundedButton boundedButton = (BoundedButton) AbstractC6246a.a(view, i8);
        if (boundedButton != null) {
            i8 = H2.f33554Y;
            Button button = (Button) AbstractC6246a.a(view, i8);
            if (button != null) {
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
                            i8 = H2.f33602o1;
                            BoundedButton boundedButton2 = (BoundedButton) AbstractC6246a.a(view, i8);
                            if (boundedButton2 != null) {
                                return new C6268r(linearLayout, boundedButton, button, linearLayout, textView, toolbar, textInputEditText, boundedButton2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6268r c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6268r d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33691U, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39725a;
    }
}
