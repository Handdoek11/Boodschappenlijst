package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import f3.InterfaceC5781e;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class VN {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5781e f19587a;

    public VN(InterfaceC5781e interfaceC5781e) {
        this.f19587a = interfaceC5781e;
    }

    public final void a(List list, String str, String str2, Object... objArr) {
        if (((Boolean) AbstractC3513ng.f25025a.e()).booleanValue()) {
            long a8 = this.f19587a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a8);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    Object obj = objArr[i8];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e8) {
                H2.p.e("unable to log", e8);
            }
            H2.p.f("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
