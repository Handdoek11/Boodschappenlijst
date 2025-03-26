package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6260j {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39672a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f39673b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f39674c;

    /* renamed from: d, reason: collision with root package name */
    public final ScrollView f39675d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f39676e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f39677f;

    private C6260j(LinearLayout linearLayout, EditText editText, TextView textView, ScrollView scrollView, TextView textView2, Toolbar toolbar) {
        this.f39672a = linearLayout;
        this.f39673b = editText;
        this.f39674c = textView;
        this.f39675d = scrollView;
        this.f39676e = textView2;
        this.f39677f = toolbar;
    }

    public static C6260j a(View view) {
        int i8 = H2.f33494D0;
        EditText editText = (EditText) AbstractC6246a.a(view, i8);
        if (editText != null) {
            i8 = H2.f33497E0;
            TextView textView = (TextView) AbstractC6246a.a(view, i8);
            if (textView != null) {
                i8 = H2.f33500F0;
                ScrollView scrollView = (ScrollView) AbstractC6246a.a(view, i8);
                if (scrollView != null) {
                    i8 = H2.f33503G0;
                    TextView textView2 = (TextView) AbstractC6246a.a(view, i8);
                    if (textView2 != null) {
                        i8 = H2.f33587j1;
                        Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                        if (toolbar != null) {
                            return new C6260j((LinearLayout) view, editText, textView, scrollView, textView2, toolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6260j c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6260j d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33677G, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39672a;
    }
}
