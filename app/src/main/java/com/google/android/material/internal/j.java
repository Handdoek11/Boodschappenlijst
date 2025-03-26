package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    private float f32135c;

    /* renamed from: d, reason: collision with root package name */
    private float f32136d;

    /* renamed from: g, reason: collision with root package name */
    private S3.d f32139g;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f32133a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final S3.f f32134b = new a();

    /* renamed from: e, reason: collision with root package name */
    private boolean f32137e = true;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f32138f = new WeakReference(null);

    class a extends S3.f {
        a() {
        }

        @Override // S3.f
        public void a(int i8) {
            j.this.f32137e = true;
            b bVar = (b) j.this.f32138f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // S3.f
        public void b(Typeface typeface, boolean z7) {
            if (z7) {
                return;
            }
            j.this.f32137e = true;
            b bVar = (b) j.this.f32138f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public j(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f32133a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f32133a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f32135c = d(str);
        this.f32136d = c(str);
        this.f32137e = false;
    }

    public S3.d e() {
        return this.f32139g;
    }

    public float f(String str) {
        if (!this.f32137e) {
            return this.f32136d;
        }
        i(str);
        return this.f32136d;
    }

    public TextPaint g() {
        return this.f32133a;
    }

    public float h(String str) {
        if (!this.f32137e) {
            return this.f32135c;
        }
        i(str);
        return this.f32135c;
    }

    public void j(b bVar) {
        this.f32138f = new WeakReference(bVar);
    }

    public void k(S3.d dVar, Context context) {
        if (this.f32139g != dVar) {
            this.f32139g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f32133a, this.f32134b);
                b bVar = (b) this.f32138f.get();
                if (bVar != null) {
                    this.f32133a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f32133a, this.f32134b);
                this.f32137e = true;
            }
            b bVar2 = (b) this.f32138f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z7) {
        this.f32137e = z7;
    }

    public void m(boolean z7) {
        this.f32137e = z7;
    }

    public void n(Context context) {
        this.f32139g.n(context, this.f32133a, this.f32134b);
    }
}
