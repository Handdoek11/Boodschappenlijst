package com.google.android.gms.ads;

import D2.C0555y;
import H2.p;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.InterfaceC4289un;
import i3.BinderC5853b;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC4289un f13059o;

    private final void a() {
        InterfaceC4289un interfaceC4289un = this.f13059o;
        if (interfaceC4289un != null) {
            try {
                interfaceC4289un.B();
            } catch (RemoteException e8) {
                p.i("#007 Could not call remote method.", e8);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i8, int i9, Intent intent) {
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.y2(i8, i9, intent);
            }
        } catch (Exception e8) {
            p.i("#007 Could not call remote method.", e8);
        }
        super.onActivityResult(i8, i9, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                if (!interfaceC4289un.S()) {
                    return;
                }
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
        }
        super.onBackPressed();
        try {
            InterfaceC4289un interfaceC4289un2 = this.f13059o;
            if (interfaceC4289un2 != null) {
                interfaceC4289un2.f();
            }
        } catch (RemoteException e9) {
            p.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.a0(BinderC5853b.p2(configuration));
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC4289un l8 = C0555y.a().l(this);
        this.f13059o = l8;
        if (l8 == null) {
            p.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            l8.C4(bundle);
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.k();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.o();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.l3(i8, strArr, iArr);
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.q();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.r();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.x0(bundle);
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.t();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.x();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC4289un interfaceC4289un = this.f13059o;
            if (interfaceC4289un != null) {
                interfaceC4289un.u();
            }
        } catch (RemoteException e8) {
            p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i8) {
        super.setContentView(i8);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
