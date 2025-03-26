package l5;

import android.view.View;
import i5.C5865e;
import i5.InterfaceC5866f;

/* renamed from: l5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6175a extends AbstractC6176b implements InterfaceC5866f {

    /* renamed from: E, reason: collision with root package name */
    private final C5865e f38805E;

    public AbstractC6175a(View view) {
        super(view);
        this.f38805E = new C5865e();
    }

    @Override // i5.InterfaceC5866f
    public int f() {
        return this.f38805E.a();
    }

    @Override // i5.InterfaceC5866f
    public void j(int i8) {
        this.f38805E.b(i8);
    }
}
