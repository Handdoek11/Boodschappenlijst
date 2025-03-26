package y3;

import Z2.AbstractC0765d;
import Z2.AbstractC0769h;
import Z2.C0766e;
import Z2.O;
import Z2.r;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.api.c;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6945a extends AbstractC0769h implements x3.e {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f44560M = 0;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f44561I;

    /* renamed from: J, reason: collision with root package name */
    private final C0766e f44562J;

    /* renamed from: K, reason: collision with root package name */
    private final Bundle f44563K;

    /* renamed from: L, reason: collision with root package name */
    private final Integer f44564L;

    public C6945a(Context context, Looper looper, boolean z7, C0766e c0766e, Bundle bundle, c.a aVar, c.b bVar) {
        super(context, looper, 44, c0766e, aVar, bVar);
        this.f44561I = true;
        this.f44562J = c0766e;
        this.f44563K = bundle;
        this.f44564L = c0766e.g();
    }

    public static Bundle l0(C0766e c0766e) {
        c0766e.f();
        Integer g8 = c0766e.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c0766e.a());
        if (g8 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g8.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // Z2.AbstractC0765d
    protected final Bundle A() {
        if (!y().getPackageName().equals(this.f44562J.d())) {
            this.f44563K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f44562J.d());
        }
        return this.f44563K;
    }

    @Override // Z2.AbstractC0765d
    protected final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // Z2.AbstractC0765d
    protected final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // x3.e
    public final void a(f fVar) {
        r.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b8 = this.f44562J.b();
            ((g) D()).p2(new j(1, new O(b8, ((Integer) r.l(this.f44564L)).intValue(), "<<default account>>".equals(b8.name) ? T2.a.a(y()).b() : null)), fVar);
        } catch (RemoteException e8) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.I4(new l(1, new C1103b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }

    @Override // Z2.AbstractC0765d, com.google.android.gms.common.api.a.f
    public final int j() {
        return 12451000;
    }

    @Override // Z2.AbstractC0765d, com.google.android.gms.common.api.a.f
    public final boolean o() {
        return this.f44561I;
    }

    @Override // x3.e
    public final void p() {
        l(new AbstractC0765d.C0127d());
    }

    @Override // Z2.AbstractC0765d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
