package Q3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f4695a;

    /* renamed from: b, reason: collision with root package name */
    protected final View f4696b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f4697c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f4698d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f4699e;

    public a(View view) {
        this.f4696b = view;
        Context context = view.getContext();
        this.f4695a = d.g(context, D3.b.f1386J, B0.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f4697c = d.f(context, D3.b.f1377A, 300);
        this.f4698d = d.f(context, D3.b.f1380D, 150);
        this.f4699e = d.f(context, D3.b.f1379C, 100);
    }
}
