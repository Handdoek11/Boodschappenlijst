package M2;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.BN;
import com.google.android.gms.internal.ads.DG;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t0 implements DG {

    /* renamed from: o, reason: collision with root package name */
    private final BN f3946o;

    /* renamed from: s, reason: collision with root package name */
    private final s0 f3947s;

    /* renamed from: t, reason: collision with root package name */
    private final String f3948t;

    /* renamed from: u, reason: collision with root package name */
    private final int f3949u;

    public t0(BN bn, s0 s0Var, String str, int i8) {
        this.f3946o = bn;
        this.f3947s = s0Var;
        this.f3948t = str;
        this.f3949u = i8;
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void a(N n8) {
        String str;
        if (n8 == null || this.f3949u == 2) {
            return;
        }
        if (TextUtils.isEmpty(n8.f3803c)) {
            this.f3947s.d(this.f3948t, n8.f3802b, this.f3946o);
            return;
        }
        try {
            str = new JSONObject(n8.f3803c).optString("request_id");
        } catch (JSONException e8) {
            C2.v.s().x(e8, "RenderSignals.getRequestId");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3947s.d(str, n8.f3803c, this.f3946o);
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void E(String str) {
    }
}
