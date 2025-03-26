package z0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: z0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7003G {

    /* renamed from: a, reason: collision with root package name */
    private int f44679a;

    /* renamed from: b, reason: collision with root package name */
    private int f44680b;

    public C7003G(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f44679a | this.f44680b;
    }

    public void b(View view, View view2, int i8) {
        c(view, view2, i8, 0);
    }

    public void c(View view, View view2, int i8, int i9) {
        if (i9 == 1) {
            this.f44680b = i8;
        } else {
            this.f44679a = i8;
        }
    }

    public void d(View view, int i8) {
        if (i8 == 1) {
            this.f44680b = 0;
        } else {
            this.f44679a = 0;
        }
    }
}
