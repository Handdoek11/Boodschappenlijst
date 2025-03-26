package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6271u {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39745a;

    /* renamed from: b, reason: collision with root package name */
    public final Button f39746b;

    /* renamed from: c, reason: collision with root package name */
    public final View f39747c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f39748d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f39749e;

    private C6271u(LinearLayout linearLayout, Button button, View view, TextView textView, TextView textView2) {
        this.f39745a = linearLayout;
        this.f39746b = button;
        this.f39747c = view;
        this.f39748d = textView;
        this.f39749e = textView2;
    }

    public static C6271u a(View view) {
        View a8;
        int i8 = H2.f33490C;
        Button button = (Button) AbstractC6246a.a(view, i8);
        if (button != null && (a8 = AbstractC6246a.a(view, (i8 = H2.f33565c0))) != null) {
            i8 = H2.f33626w1;
            TextView textView = (TextView) AbstractC6246a.a(view, i8);
            if (textView != null) {
                i8 = H2.f33492C1;
                TextView textView2 = (TextView) AbstractC6246a.a(view, i8);
                if (textView2 != null) {
                    return new C6271u((LinearLayout) view, button, a8, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6271u c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33695Y, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39745a;
    }
}
