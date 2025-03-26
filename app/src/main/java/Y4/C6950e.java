package y4;

import Z2.AbstractC0769h;
import Z2.C0766e;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.c;
import y4.InterfaceC6953h;
import y4.InterfaceC6954i;

/* renamed from: y4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6950e extends AbstractC0769h {
    public C6950e(Context context, Looper looper, C0766e c0766e, c.a aVar, c.b bVar) {
        super(context, looper, 131, c0766e, aVar, bVar);
    }

    @Override // Z2.AbstractC0765d
    protected String E() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // Z2.AbstractC0765d
    protected String F() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // Z2.AbstractC0765d
    public boolean S() {
        return true;
    }

    @Override // Z2.AbstractC0765d, com.google.android.gms.common.api.a.f
    public int j() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z2.AbstractC0765d
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6954i s(IBinder iBinder) {
        return InterfaceC6954i.a.w0(iBinder);
    }

    void m0(InterfaceC6953h.a aVar, String str) {
        try {
            ((InterfaceC6954i) D()).l1(aVar, str);
        } catch (RemoteException unused) {
        }
    }
}
