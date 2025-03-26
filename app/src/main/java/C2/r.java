package C2;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.N9;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class r extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f799a;

    /* synthetic */ r(u uVar, t tVar) {
        this.f799a = uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            u uVar = this.f799a;
            uVar.f813y = (N9) uVar.f808t.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            e = e8;
            H2.p.h("", e);
        } catch (ExecutionException e9) {
            e = e9;
            H2.p.h("", e);
        } catch (TimeoutException e10) {
            H2.p.h("", e10);
        }
        return this.f799a.p();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        u uVar = this.f799a;
        String str = (String) obj;
        if (uVar.f811w == null || str == null) {
            return;
        }
        uVar.f811w.loadUrl(str);
    }
}
