package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6259i {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39669a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f39670b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f39671c;

    private C6259i(LinearLayout linearLayout, EditText editText, LinearLayout linearLayout2) {
        this.f39669a = linearLayout;
        this.f39670b = editText;
        this.f39671c = linearLayout2;
    }

    public static C6259i a(View view) {
        int i8 = H2.f33547V;
        EditText editText = (EditText) AbstractC6246a.a(view, i8);
        if (editText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new C6259i(linearLayout, editText, linearLayout);
    }

    public static C6259i c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6259i d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33675E, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39669a;
    }
}
