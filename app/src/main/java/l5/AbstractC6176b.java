package l5;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j5.h;
import j5.i;

/* renamed from: l5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6176b extends RecyclerView.F implements i {

    /* renamed from: A, reason: collision with root package name */
    private float f38806A;

    /* renamed from: B, reason: collision with root package name */
    private float f38807B;

    /* renamed from: C, reason: collision with root package name */
    private float f38808C;

    /* renamed from: D, reason: collision with root package name */
    private float f38809D;

    /* renamed from: u, reason: collision with root package name */
    private h f38810u;

    /* renamed from: v, reason: collision with root package name */
    private int f38811v;

    /* renamed from: w, reason: collision with root package name */
    private int f38812w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f38813x;

    /* renamed from: y, reason: collision with root package name */
    private float f38814y;

    /* renamed from: z, reason: collision with root package name */
    private float f38815z;

    public AbstractC6176b(View view) {
        super(view);
        this.f38810u = new h();
        this.f38811v = 0;
        this.f38812w = 0;
        this.f38813x = true;
        this.f38806A = -65536.0f;
        this.f38807B = -65537.0f;
        this.f38808C = 65536.0f;
        this.f38809D = 65537.0f;
    }

    @Override // j5.i
    public float a() {
        return this.f38807B;
    }

    @Override // j5.i
    public float b() {
        return this.f38814y;
    }

    @Override // j5.i
    public void c(float f8) {
        this.f38815z = f8;
    }

    @Override // j5.i
    public float d() {
        return this.f38808C;
    }

    @Override // j5.i
    public void e(int i8) {
        this.f38810u.b(i8);
    }

    @Override // j5.i
    public boolean h() {
        return this.f38813x;
    }

    @Override // j5.i
    public void i(int i8) {
        this.f38811v = i8;
    }

    @Override // j5.i
    public void k(boolean z7) {
        this.f38813x = z7;
    }

    @Override // j5.i
    public float l() {
        return this.f38806A;
    }

    @Override // j5.i
    public void m(int i8) {
        this.f38812w = i8;
    }

    @Override // j5.i
    public void n(float f8) {
        this.f38814y = f8;
    }

    @Override // j5.i
    public int p() {
        return this.f38810u.a();
    }

    @Override // j5.i
    public float q() {
        return this.f38815z;
    }

    @Override // j5.i
    public float r() {
        return this.f38809D;
    }

    @Override // j5.i
    public void o(float f8, float f9, boolean z7) {
    }
}
