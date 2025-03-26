package b3;

import X2.InterfaceC0756d;
import X2.InterfaceC0761i;
import Z2.AbstractC0769h;
import Z2.C0766e;
import Z2.C0785y;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1105d;

/* renamed from: b3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962e extends AbstractC0769h {

    /* renamed from: I, reason: collision with root package name */
    private final C0785y f11993I;

    public C0962e(Context context, Looper looper, C0766e c0766e, C0785y c0785y, InterfaceC0756d interfaceC0756d, InterfaceC0761i interfaceC0761i) {
        super(context, looper, 270, c0766e, interfaceC0756d, interfaceC0761i);
        this.f11993I = c0785y;
    }

    @Override // Z2.AbstractC0765d
    protected final Bundle A() {
        return this.f11993I.b();
    }

    @Override // Z2.AbstractC0765d
    protected final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // Z2.AbstractC0765d
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // Z2.AbstractC0765d
    protected final boolean I() {
        return true;
    }

    @Override // Z2.AbstractC0765d, com.google.android.gms.common.api.a.f
    public final int j() {
        return 203400000;
    }

    @Override // Z2.AbstractC0765d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C0958a ? (C0958a) queryLocalInterface : new C0958a(iBinder);
    }

    @Override // Z2.AbstractC0765d
    public final C1105d[] v() {
        return m3.d.f38963b;
    }
}
