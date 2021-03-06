package com.goka.easy.model.entity.xml;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by katsuyagoto on 15/08/09.
 */
@Root(name = "rss", strict = false)
public class RssXML {

    @Element
    public ChannelXML channel;

    @Attribute
    public String version;
}