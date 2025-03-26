package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6265o {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39706a;

    /* renamed from: b, reason: collision with root package name */
    public final Button f39707b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f39708c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f39709d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f39710e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f39711f;

    private C6265o(LinearLayout linearLayout, Button button, Button button2, LinearLayout linearLayout2, TextView textView, Toolbar toolbar) {
        this.f39706a = linearLayout;
        this.f39707b = button;
        this.f39708c = button2;
        this.f39709d = linearLayout2;
        this.f39710e = textView;
        this.f39711f = toolbar;
    }

    public static C6265o a(View view) {
        int i8 = H2.f33526O;
        Button button = (Button) AbstractC6246a.a(view, i8);
        if (button != null) {
            i8 = H2.f33541T;
            Button button2 = (Button) AbstractC6246a.a(view, i8);
            if (button2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i8 = H2.f33581h1;
                TextView textView = (TextView) AbstractC6246a.a(view, i8);
                if (textView != null) {
                    i8 = H2.f33587j1;
                    Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                    if (toolbar != null) {
                        return new C6265o(linearLayout, button, button2, linearLayout, textView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6265o c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6265o d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33688R, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39706a;
    }
}
