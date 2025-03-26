package com.adadapted.android.sdk.core.atl;

import J6.r;
import com.adadapted.android.sdk.core.atl.AddToListContent;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.adadapted.android.sdk.core.payload.Payload;
import com.adadapted.android.sdk.core.payload.PayloadResponse;
import java.util.ArrayList;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class AddItContentParser {
    public static final int $stable = 0;
    public static final AddItContentParser INSTANCE = new AddItContentParser();

    private AddItContentParser() {
    }

    public final AdditContent generateAddItContentFromDeeplink(Payload payload) {
        r.e(payload, AdditContent.AdditSources.PAYLOAD);
        return new AdditContent(payload.getPayloadId(), payload.getPayloadMessage(), payload.getPayloadImage(), payload.getDetailedListItems().size() <= 1 ? 2 : 1, AddToListContent.Sources.OUT_OF_APP, AdditContent.AdditSources.DEEPLINK, payload.getDetailedListItems(), null, null, 384, null);
    }

    public final List<AdditContent> generateAddItContentFromPayloads(PayloadResponse payloadResponse) {
        r.e(payloadResponse, "payloadResponse");
        List<Payload> payloads = payloadResponse.getPayloads();
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(payloads, 10));
        for (Payload payload : payloads) {
            String payloadId = payload.getPayloadId();
            String payloadMessage = payload.getPayloadMessage();
            String payloadImage = payload.getPayloadImage();
            int i8 = 1;
            if (payload.getDetailedListItems().size() <= 1) {
                i8 = 2;
            }
            arrayList.add(new AdditContent(payloadId, payloadMessage, payloadImage, i8, AddToListContent.Sources.OUT_OF_APP, AdditContent.AdditSources.PAYLOAD, payload.getDetailedListItems(), null, null, 384, null));
        }
        return arrayList;
    }
}
