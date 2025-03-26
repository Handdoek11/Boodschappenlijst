package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.ads.sd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4052sd0 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC4379vd0 f26709a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f26710b;

    private C4052sd0(InterfaceC4379vd0 interfaceC4379vd0) {
        this.f26709a = interfaceC4379vd0;
        this.f26710b = interfaceC4379vd0 != null;
    }

    public static C4052sd0 b(Context context, String str, String str2) {
        InterfaceC4379vd0 c4161td0;
        try {
            try {
                try {
                    IBinder d8 = DynamiteModule.e(context, DynamiteModule.f13442b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d8 == null) {
                        c4161td0 = null;
                    } else {
                        IInterface queryLocalInterface = d8.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        c4161td0 = queryLocalInterface instanceof InterfaceC4379vd0 ? (InterfaceC4379vd0) queryLocalInterface : new C4161td0(d8);
                    }
                    c4161td0.r2(BinderC5853b.p2(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new C4052sd0(c4161td0);
                } catch (Exception e8) {
                    throw new zzfom(e8);
                }
            } catch (RemoteException | zzfom | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new C4052sd0(new BinderC4488wd0());
            }
        } catch (Exception e9) {
            throw new zzfom(e9);
        }
    }

    public static C4052sd0 c() {
        BinderC4488wd0 binderC4488wd0 = new BinderC4488wd0();
        Log.d("GASS", "Clearcut logging disabled");
        return new C4052sd0(binderC4488wd0);
    }

    public final C3835qd0 a(byte[] bArr) {
        return new C3835qd0(this, bArr, null);
    }
}
