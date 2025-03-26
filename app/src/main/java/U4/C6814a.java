package u4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import m4.AbstractC6203i;
import org.json.JSONObject;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6814a {

    /* renamed from: a, reason: collision with root package name */
    private final File f43967a;

    public C6814a(s4.g gVar) {
        this.f43967a = gVar.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f43967a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        j4.g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a8 = a();
                if (a8.exists()) {
                    fileInputStream = new FileInputStream(a8);
                    try {
                        jSONObject = new JSONObject(AbstractC6203i.A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e8) {
                        e = e8;
                        j4.g.f().e("Failed to fetch cached settings", e);
                        AbstractC6203i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    j4.g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC6203i.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e9) {
                e = e9;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC6203i.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            AbstractC6203i.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j8, JSONObject jSONObject) {
        j4.g.f().i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j8);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    AbstractC6203i.f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e8) {
                    e = e8;
                    fileWriter = fileWriter2;
                    j4.g.f().e("Failed to cache settings", e);
                    AbstractC6203i.f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    AbstractC6203i.f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
