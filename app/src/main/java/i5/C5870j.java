package i5;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import l5.AbstractC6177c;

/* renamed from: i5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5870j {

    /* renamed from: a, reason: collision with root package name */
    public final int f36585a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36586b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36587c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36588d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36589e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36590f;

    /* renamed from: g, reason: collision with root package name */
    public final int f36591g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f36592h;

    /* renamed from: i, reason: collision with root package name */
    public final int f36593i;

    public C5870j(RecyclerView recyclerView, RecyclerView.F f8, int i8, int i9) {
        this.f36585a = f8.f10944a.getWidth();
        this.f36586b = f8.f10944a.getHeight();
        this.f36587c = f8.E();
        int left = f8.f10944a.getLeft();
        this.f36588d = left;
        int top = f8.f10944a.getTop();
        this.f36589e = top;
        this.f36590f = i8 - left;
        this.f36591g = i9 - top;
        Rect rect = new Rect();
        this.f36592h = rect;
        AbstractC6177c.o(f8.f10944a, rect);
        this.f36593i = AbstractC6177c.u(f8);
    }

    public static C5870j a(C5870j c5870j, RecyclerView.F f8) {
        return new C5870j(c5870j, f8);
    }

    private C5870j(C5870j c5870j, RecyclerView.F f8) {
        this.f36587c = c5870j.f36587c;
        int width = f8.f10944a.getWidth();
        this.f36585a = width;
        int height = f8.f10944a.getHeight();
        this.f36586b = height;
        this.f36592h = new Rect(c5870j.f36592h);
        this.f36593i = AbstractC6177c.u(f8);
        this.f36588d = c5870j.f36588d;
        this.f36589e = c5870j.f36589e;
        float f9 = width * 0.5f;
        float f10 = height * 0.5f;
        float f11 = (c5870j.f36590f - (c5870j.f36585a * 0.5f)) + f9;
        float f12 = (c5870j.f36591g - (c5870j.f36586b * 0.5f)) + f10;
        if (f11 >= 0.0f && f11 < width) {
            f9 = f11;
        }
        this.f36590f = (int) f9;
        if (f12 >= 0.0f && f12 < height) {
            f10 = f12;
        }
        this.f36591g = (int) f10;
    }
}
