package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import com.headcode.ourgroceries.android.view.BoundedButton;
import n1.AbstractC6246a;

/* renamed from: n5.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6266p {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39712a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f39713b;

    /* renamed from: c, reason: collision with root package name */
    public final BoundedButton f39714c;

    /* renamed from: d, reason: collision with root package name */
    public final EditText f39715d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f39716e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f39717f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f39718g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f39719h;

    private C6266p(LinearLayout linearLayout, LinearLayout linearLayout2, BoundedButton boundedButton, EditText editText, Button button, LinearLayout linearLayout3, Toolbar toolbar, TextView textView) {
        this.f39712a = linearLayout;
        this.f39713b = linearLayout2;
        this.f39714c = boundedButton;
        this.f39715d = editText;
        this.f39716e = button;
        this.f39717f = linearLayout3;
        this.f39718g = toolbar;
        this.f39719h = textView;
    }

    public static C6266p a(View view) {
        int i8 = H2.f33532Q;
        LinearLayout linearLayout = (LinearLayout) AbstractC6246a.a(view, i8);
        if (linearLayout != null) {
            i8 = H2.f33535R;
            BoundedButton boundedButton = (BoundedButton) AbstractC6246a.a(view, i8);
            if (boundedButton != null) {
                i8 = H2.f33550W;
                EditText editText = (EditText) AbstractC6246a.a(view, i8);
                if (editText != null) {
                    i8 = H2.f33554Y;
                    Button button = (Button) AbstractC6246a.a(view, i8);
                    if (button != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        i8 = H2.f33587j1;
                        Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                        if (toolbar != null) {
                            i8 = H2.f33629x1;
                            TextView textView = (TextView) AbstractC6246a.a(view, i8);
                            if (textView != null) {
                                return new C6266p(linearLayout2, linearLayout, boundedButton, editText, button, linearLayout2, toolbar, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6266p c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6266p d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33689S, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39712a;
    }
}
