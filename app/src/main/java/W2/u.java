package w2;

import D2.C0555y;
import D2.U0;
import D2.g2;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final U0 f44316a;

    /* renamed from: b, reason: collision with root package name */
    private final List f44317b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private j f44318c;

    private u(U0 u02) {
        this.f44316a = u02;
        if (u02 != null) {
            try {
                List h8 = u02.h();
                if (h8 != null) {
                    Iterator it = h8.iterator();
                    while (it.hasNext()) {
                        j e8 = j.e((g2) it.next());
                        if (e8 != null) {
                            this.f44317b.add(e8);
                        }
                    }
                }
            } catch (RemoteException e9) {
                H2.p.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e9);
            }
        }
        U0 u03 = this.f44316a;
        if (u03 == null) {
            return;
        }
        try {
            g2 c8 = u03.c();
            if (c8 != null) {
                this.f44318c = j.e(c8);
            }
        } catch (RemoteException e10) {
            H2.p.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
        }
    }

    public static u d(U0 u02) {
        if (u02 != null) {
            return new u(u02);
        }
        return null;
    }

    public static u e(U0 u02) {
        return new u(u02);
    }

    public String a() {
        try {
            U0 u02 = this.f44316a;
            if (u02 != null) {
                return u02.g();
            }
            return null;
        } catch (RemoteException e8) {
            H2.p.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e8);
            return null;
        }
    }

    public Bundle b() {
        try {
            U0 u02 = this.f44316a;
            if (u02 != null) {
                return u02.b();
            }
        } catch (RemoteException e8) {
            H2.p.e("Could not forward getResponseExtras to ResponseInfo.", e8);
        }
        return new Bundle();
    }

    public String c() {
        try {
            U0 u02 = this.f44316a;
            if (u02 != null) {
                return u02.f();
            }
            return null;
        } catch (RemoteException e8) {
            H2.p.e("Could not forward getResponseId to ResponseInfo.", e8);
            return null;
        }
    }

    public final U0 f() {
        return this.f44316a;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        String c8 = c();
        if (c8 == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", c8);
        }
        String a8 = a();
        if (a8 == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", a8);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f44317b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((j) it.next()).f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        j jVar = this.f44318c;
        if (jVar != null) {
            jSONObject.put("Loaded Adapter Response", jVar.f());
        }
        Bundle b8 = b();
        if (b8 != null) {
            jSONObject.put("Response Extras", C0555y.b().m(b8));
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return g().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
