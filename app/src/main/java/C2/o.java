package C2;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.AbstractC3351m70;

/* loaded from: classes.dex */
final class o extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f796a;

    o(u uVar) {
        this.f796a = uVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        u uVar = this.f796a;
        if (uVar.f812x != null) {
            try {
                uVar.f812x.y(AbstractC3351m70.d(1, null, null));
            } catch (RemoteException e8) {
                H2.p.i("#007 Could not call remote method.", e8);
            }
        }
        u uVar2 = this.f796a;
        if (uVar2.f812x != null) {
            try {
                uVar2.f812x.D(0);
            } catch (RemoteException e9) {
                H2.p.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f796a.q())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            u uVar = this.f796a;
            if (uVar.f812x != null) {
                try {
                    uVar.f812x.y(AbstractC3351m70.d(3, null, null));
                } catch (RemoteException e8) {
                    H2.p.i("#007 Could not call remote method.", e8);
                }
            }
            u uVar2 = this.f796a;
            if (uVar2.f812x != null) {
                try {
                    uVar2.f812x.D(3);
                } catch (RemoteException e9) {
                    H2.p.i("#007 Could not call remote method.", e9);
                }
            }
            this.f796a.t7(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            u uVar3 = this.f796a;
            if (uVar3.f812x != null) {
                try {
                    uVar3.f812x.y(AbstractC3351m70.d(1, null, null));
                } catch (RemoteException e10) {
                    H2.p.i("#007 Could not call remote method.", e10);
                }
            }
            u uVar4 = this.f796a;
            if (uVar4.f812x != null) {
                try {
                    uVar4.f812x.D(0);
                } catch (RemoteException e11) {
                    H2.p.i("#007 Could not call remote method.", e11);
                }
            }
            this.f796a.t7(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            u uVar5 = this.f796a;
            if (uVar5.f812x != null) {
                try {
                    uVar5.f812x.f();
                } catch (RemoteException e12) {
                    H2.p.i("#007 Could not call remote method.", e12);
                }
            }
            this.f796a.t7(this.f796a.v(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        u uVar6 = this.f796a;
        if (uVar6.f812x != null) {
            try {
                uVar6.f812x.a();
                this.f796a.f812x.e();
            } catch (RemoteException e13) {
                H2.p.i("#007 Could not call remote method.", e13);
            }
        }
        u.C7(this.f796a, u.z7(this.f796a, str));
        return true;
    }
}
